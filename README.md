# Android MVP

Purpose: This repository demonstrates the Model View Presenter architecture.

![](/mvp.png)

## Benefits:

* A flexible pattern for separation of concerns 
* Views and Models are both unaware and decoupled from each other.
* Each class is designed by contract which allows easy mocking of Views and Models for testing and development. 

## Instructions

This repository contains a **chain of branches** that shows the logical progression of the Android MVP. 

1. ``git checkout 1-login-view`` - demonstates a simple View which is a LoginActivity
1. ``git checkout 2-synchronous-login-mvp`` - demonstrates Login MVP implementation with a synchronous Model (or interactor).
1. ``git checkout 3-async-login-mvp`` - demonstrates Login MVP with an asynchronous Model which does not change any code in the LoginActivity
1. ``git checkout 4-list-activity-view`` - demonstates a more complex View (RepoListActivity) and an Asynchronous Networked Model which shows a users Github repositories sorted by stars.
1. ``git checkout 5-list-fragment`` - substitutes the RepoListActivity for a Fragment without changing any code in the Model. 
1. The ``master`` branch contains the completed project. 

