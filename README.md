# Basic Android MVP - PipeDrive test assignment

## Intro

This sample project is inspired in the initial project of [master-2](https://github.com/jpotts18/android-mvp) which i used as starting point for my vision of a simple MVP.
Much of the reasoning behind the current structure is aimed at organizing the code in a way that it's easy to read for others, most of the time some of my fellow programmers wrote code meant to be for them and for them only which is in my opinion and negative aspect in team but not so important if it's only you behind the source code as long as you can come back later and be able to understand what was your reasoning when you wrote this line or the other.
Enforcing design patterns like a true fanatic may lead to more problems than solutions. I believe that one should take the best of the features and the benefits patterns can offer assimilate them then proceed to make adjustments and make sure everyone is now on the same page.  Having something that everyone can understand extend and maintain is the nicer way to go to work everyday, it makes it easier for feature delivery, team rotation and eventually getting your product out there.


## Inspiration
Part of me always believed  that guidelines are necessary in order to communicate ideas or give people some context,  what better starting point than open source- projects  my ideal modern app lies in between an MVP+Clean architecture  plus  MVP + Reactive programming(JavaRx2) :

 [todo-mvp-clean](https://github.com/googlesamples/android-architecture/tree/todo-mvp-clean/)


I find everything about JavaRx scary and confusing but i understand the value it brings at binding components inside applications so that's i include rxjava in my list. 
 [todo-mvp-rxjava](https://github.com/googlesamples/android-architecture/tree/todo-mvp-rxjava/)  



## Videos

[Android MVP Playlist - by JeffPortter (https://github.com/jpotts18) ](https://www.youtube.com/playlist?list=PLfbTKxZYb1mhQQaajZw0OntPcioSPdfKM)
[RxJava common mistakes - Dan Lew](https://www.youtube.com/watch?v=QdmkXL7XikQ)

## Getting Started

1. Clone the Repo - ``git clone git@github.com:dante8300/android-mvp.git``
2. Look at all of the branches - ``git branch -a``

This repository contains a **chain of branches** that shows the logical progression of the Android MVP. 

* ``git checkout dev`` - Shows a simple logging activity following a simple MVP pattern using a basic JavaRx approach and endpoint communication. 
* ``git checkout dev-db-rx`` - Is the next iteration involving persistence and a basic model for the logging activity.
* ``git checkout dev-db-rx-2`` - Aside from the logging includes an extra use case involving communication with and additional endpoint.
* ``git checkout dev-db-rx-2-td`` - MVP is not only good for organizing code and separation of concerns while designing  and app it also makes it easier to test.
* The ``master`` branch contains the completed project. 

## What is MVP?

[Model-View-Presenter](http://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter) is a user interface architectural pattern engineered to facilitate automated unit testing and improve the separation of concerns in presentation logic:

* The **Model** is an interface defining the data to be displayed or otherwise acted upon in the user interface.
* The **View** is a passive interface that displays data (the Model) and routes user commands (events) to the presenter to act upon that data.
* The **Presenter** acts upon the model and the view. It retrieves data from repositories (the model), and formats it for display in the view.


## Benefits

* **Loose Coupling** - The Presenter is an intermediary between the View code and the Model. This allows the View and the Model to evolve independently of each other.
* **[Separation of Concerns](http://en.wikipedia.org/wiki/Separation_of_concerns)** - Individual sections can be reused, as well as developed and updated independently. 
* **More Testable** – By isolating each major component (UI, Presenter, and Model) it is easier to write unit tests. This is especially true when using the MVP pattern which only interacts with the view using an interface.
* **Code Reuse** – By using a separation of concerns/responsible design approach you will increase code reuse. 
* **Flexibility** - By isolating most of your code into the Presenter and Model components your code base is more flexible to change in the View. 

## Key differences between MVC and MVP
 
MVP Pattern
* View is more loosely coupled to the model. The presenter is responsible for binding the model to the view.
* Easier to unit test because interaction with the view is through an interface
* Usually view to presenter map one to one. Complex views may have multi presenters.
 
MVC Pattern
* Controller are based on behaviors and can be shared across views
* Can be responsible for determining which view to display (Front Controller Pattern)

#### References
[MVC or MVP Pattern – Whats the difference?](http://www.infragistics.com/community/blogs/todd_snyder/archive/2007/10/17/mvc-or-mvp-pattern-whats-the-difference.aspx)

[Model-View-Presenter - Wikipedia](http://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter)

[Separation of Concerns - Wikipedia](http://en.wikipedia.org/wiki/Separation_of_concerns)

[Jeff Portter repo](https://github.com/jpotts18/android-mvp)

#### Notes
Clean your project from all those file listed in gitignore. 
 git rm -r --cached . 
 git add .
 git commit -m 'Removed all files that are in the .gitignore' 
 git push origin master