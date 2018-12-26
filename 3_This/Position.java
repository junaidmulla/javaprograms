/*
 * Filename: Position.java
 * Project: this keyword
 * Created Date: Wednesday, December 26th 2018, 10:47:26 pm
 * Author: Aiman Kazi
 * 
 * Copyright (c) 2018 Visual Labs
 */

// SELF REFERENCE
//
// Sometimes you'll need to refer to an object 
// within one of its methods or constructors, 
// to do so you can use the keyword this.
// this is a reference to the current object 
// the object whose method or constructor is being called. 
// You can refer to any field of the current object 
// from within a method or a constructor by using this.

class Position {
    int row;
    int column;

    Position() {
        row = 0;
        column = 0;
    }

    Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

}
