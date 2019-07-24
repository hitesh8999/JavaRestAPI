Feature: Rest Calculator 

	 Scenario:Invoking Addition
		Given Rest Api "http://localhost:8080/addition?firstOperand=10&secondOperand=10"
	        When invoking REST api for addition
	        Then expecting result 20

