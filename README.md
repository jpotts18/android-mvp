# Android MVP

This repository demonstrates the [Model View Presenter](http://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter) architecture and was inspired by [Antonio Leiva's Android MVP](https://github.com/antoniolg/androidmvp)

## Videos

[Android MVP Playlist - Youtube](https://www.youtube.com/playlist?list=PLfbTKxZYb1mhQQaajZw0OntPcioSPdfKM)

## Getting Started

1. Clone the Repo - ``git clone git@github.com:jpotts18/android-mvp.git``
1. Look at all of the branches - ``git branch -a``
2. **Read about the branches**

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
