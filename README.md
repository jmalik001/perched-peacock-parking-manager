# perched-peacock-parking-manager
Parking management system for Perched Peacock

This project consist of 2 modules 
  perched-peacock-parcking-api
  perched-peacock-parcking-gui
  
  #1 has backend devlopment such as URI's to serve business purpose.
  user/users --> To view User
  admin/Booking --> book a parking
  /search/{area} to search parkings
  
  the URI as devided into 2 roles -- User and admin
  
  Tech stack used : Angular ,springboot ,DATA JPA, h2 DB, REST APIS, maven, swagger UI 2
  
  Architecture doc attached in /docs directory
  
  Junit integrated and can be see for UserDao
  BDD integrated , can be seen for /User test (results not compired)
  
  travis integrated for continious integration
  
  The idea here is to give facility to the User 
    to search parking in a particular Area
    after getting parkinng details 
    select parking name to book , select rate the book it
    
    Admin can see the bookings of users 
    
   Schema details in /resources directory of repo
