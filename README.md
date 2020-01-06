# spring-boot-hateoas-principle

Generally speaking, the principle implies that the API should guide the client through the application by returning relevant information about the next potential steps, along with each response.
  
  
  We have used the below methods of hateoas:
  linkTo() method inspects the controller class and obtains its root mapping
  slash() method adds the customerId value as the path variable of the link
  withSelfMethod() qualifies the relation as a self-link
