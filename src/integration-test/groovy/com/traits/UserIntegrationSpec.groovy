package com.traits


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class UserIntegrationSpec extends Specification {

	void testFirstSave(){

		def user=new user(username:'Nesta',password:'pwd', homepage:'http://www.traits.com')
		assertNotNull user.save();
		assertNotNull user.name;
		def foundUser=user.get(user.name);
		assertEquals 'Nesta',foundUser.username

	}
    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
