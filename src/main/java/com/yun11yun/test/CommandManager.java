package com.yun11yun.test;

public abstract class CommandManager {

    public Object process(Object commandState) {
        Command command = createCommand();
        command.setState(commandState);
        return command.execute();
    }

    public abstract Command createCommand();

}
