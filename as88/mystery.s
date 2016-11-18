    _EXIT   = 1
    _WRITE  = 4
    _STDOUT = 1
.SECT   .TEXT
start:
    MOV     CX,de-hw
1:  PUSH    CS
    PUSH    hw
    PUSH    _STDOUT
    PUSH    _WRITE
    SYS
    ADD     SP,8
    SUB     CX,1
    JNZ     1b
    PUSH    0
    PUSH    _EXIT
    SYS
.SECT   .DATA
hw:
.ASCII  "Hello World\n"
de:     .BYTE   0
.SECT   .BSS