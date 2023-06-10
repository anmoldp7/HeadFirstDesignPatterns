# Command

Encapsulates request to an object, allowing parameterization of other objects with different requests, queue, log requests.
Support undoable operation.

- Decoupling object making the request from the object receiving and executing the request.
- Meta command pattern: create macros of commands to execute multiple commands at once.
- **Pattern Honorable Mention:** Null Object
  - When you don't have meaningful object to return, yet you want to remove responsibility to handle **null** from client.
  - For example NoCommand object in remote control example.
- More use of command pattern: queueing requests. (throwback to Go channels?) and logging requests.
  - Implementing logging and transactional systems using command design pattern.

!["COMMAND I"](command_pt1.png "command 1")
!["COMMAND II"](command_pt2.png "command 2")
!["COMMAND III"](command_pt3.png "command 3")
!["COMMAND IV"](command_pt4.png "command 4")
!["COMMAND V"](command_pt5.png "command 5")
