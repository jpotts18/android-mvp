# Basic Android MVP - PipeDrive test assignment

This sample project is inspired in the initial project of [master-2](https://github.com/jpotts18/android-mvp)
which i used as  starting point for my vision of a simple MVP. 

Much of the reasoning behind the current structure is aimed at organizing the code in a way that it's easy to read for others, most of the time some my fellow programmers write code meant to be for them and for them only. 

Enforcing desing patterns like a true fanatic may lead to more problems thant solutions  i belive that one should take the best of the features and the benefits of them and make adjustments thinking about the team.  Having something that every one can understand, extend and maintain is the way to go.

In contrast part of me is always an advocate of rules and guidelines in order to comunicate ideas and speak the same language with others for example i find this blueprint a fascinating idea to organize out project following
MVP + Clean Arquitecture. 

 [todo-mvp-clean](https://github.com/googlesamples/android-architecture/tree/todo-mvp-clean/)

But the work should stop there  i also find this the next step the check list and it's to combine MVP + JavaRx 
in the following repo there is some good example involing the whole toolbox mixing reactive programming, dependency injenction, test driven development and more. 
 This repository is also inspired the samples found in [todo-mvp-rxjava](https://github.com/googlesamples/android-architecture/tree/todo-mvp-rxjava/)  



## Videos

[Android MVP Playlist - Youtube](https://www.youtube.com/playlist?list=PLfbTKxZYb1mhQQaajZw0OntPcioSPdfKM)

## Getting Started

1. Clone the Repo - ``git clone git@github.com:jpotts18/android-mvp.git``
1. Look at all of the branches - ``git branch -a``
2. **Read about the branches**
1. Don't forget to checkout the `master-2` it has updated libraries like RxJava, Butterknife, etc.

This repository contains a **chain of branches** that shows the logical progression of the Android MVP. 

* ``git checkout 1-login-view`` - demonstates a simple View which is a LoginActivity
* ``git checkout 2-synchronous-login-mvp`` - demonstrates Login MVP implementation with a synchronous Model (or interactor).
* ``git checkout 3-async-login-mvp`` - demonstrates Login MVP with an asynchronous Model which does not change any code in the LoginActivity
* ``git checkout 4-list-activity-view`` - demonstates a more complex View (RepoListActivity) and an Asynchronous Networked Model which shows a users Github repositories sorted by stars.
* ``git checkout 5-list-fragment`` - substitutes the RepoListActivity for a Fragment without changing any code in the Model. 
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
