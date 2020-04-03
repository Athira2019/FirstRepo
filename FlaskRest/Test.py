# -*- coding: utf-8 -*-
"""
Created on Tue Mar 31 14:54:08 2020

@author: AS045216
"""

from flask import Flask
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)
app.config["SQLALCHEMY_DATABASE_URI"] = "sqlite:///test.db"

db = SQLAlchemy(app)

class User(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    username = db.Column(db.String(80), unique=True)
    email = db.Column(db.String(120), unique=True)

    def __init__(self, username, email):
        self.username = username
        self.email = email

    def __repr__(self):
        return "<User %r>" % self.username

@app.route("/")
def index():
    return User.query.all() # I don't think this will work

if __name__ == "__main__":
    db.create_all()

    x = User("test", "test@gmail.com")
    db.session.add(x)
    db.session.commit()

    app.run(debug=True)