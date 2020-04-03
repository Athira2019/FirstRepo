from flask import Flask,jsonify,request,Response


from BookModel import *
from settings import *
import json
import jwt,datetime

##__name__=="__main__"

app.config['SECRET_KEY']='meow'

@app.route('/login')
def get_token():
    expiration_date=datetime.datetime.utcnow()+datetime.timedelta(seconds=100)
    token=jwt.encode({'exp':expiration_date},app.config['SECRET_KEY'],algorithm='HS256')
    return token

def validBook(bookObject):
    if ("name" in bookObject and "price" in bookObject and "isbn" in bookObject):
        return True
    else:
        return False

@app.route('/books')
def get_books():
    token=request.args.get('token')
    try:
        jwt.decode(token,app.config['SECRET_KEY'])
    except:
        return jsonify({'error':'Need a valid token'}),401
    return jsonify({'books':Book.get_all_book()})
#POST/books
    # {
     #  'name':'Egg Book',
      # 'price':20,
       #'isbn':9273918391938
     #  }

@app.route('/books',methods=['POST'])
def add_book():
    request_data=request.get_json()
    if(validBook(request_data)):
        Book.add_book(request_data['name'],request_data['price'],request_data['isbn'])
        response=Response("",status=201,mimetype='application/json')
        response.headers['Location']="/books/"+str(request_data['isbn'])
        return response
    else:
        response=Response("",status=400,mimetype='application/json')
        return response


@app.route('/books/<int:isbn>')
def get_book_isbn(isbn):
    return_value=Book.get_book(isbn)
    return jsonify(return_value)

app.run(port=5000)

