Cucumber sample
===============

This project is my first sample with cucumber. The main goal is generate a docker image that run the test (DONE). The next goal is to be used in a composition with a businnes container, acting as acceptance test.

This version uses cucumber-jvm, so 


Building
--------

To build the project and the container:

    $ mvn clean package && docker build -t jomoespe/test .


Running
-------

To run the test container in standalone mode:

    $  docker run jomoespe/test


Next steps
----------

The next steps should be:

  - Compose with *acceptance test container* and a *functional container*
  - Change the acceptance test container, to build the test in another language (¿JS?)
