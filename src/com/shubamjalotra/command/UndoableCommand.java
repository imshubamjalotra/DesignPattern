package com.shubamjalotra.command;

public interface UndoableCommand extends Command {
    void undo();
}
