package com.example.application;

import java.net.URI;

public class JiraClient {
 
	private String username;
	private String password;
	private String jiraUrl;
	private String restClient;
	
	public JiraClient(String username, String password, String jiraUrl) {
		this.username = username;
	    this.password = password;
	    this.jiraUrl = jiraUrl;
	    this.restClient = getJiraRestClient();
	}

	JiraClient myJiraClient = new JiraClient(
			  "user.name", 
			  "password", 
			  "http://jira.company.com");
	
	private JiraRestClient getJiraRestClient() {
	    return new AsynchronousJiraRestClientFactory()
	      .createWithBasicHttpAuthentication(getJiraUri(), this.username, this.password);
	}
	
	private URI getJiraUri() {
	    return URI.create(this.jiraUrl);
	}
}
