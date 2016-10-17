package com.traits

class User {
	String name
	String password
	String homepage
	Date dateCreated

    static constraints = {
    	username(size: 3..20,unique:true)
    	password(size: 4..8)
    	homepage(url: true, nullable:true)

    }
}
