package command;


import classes.SpaceMarine;
import objectResAns.ObjectResAns;

import java.util.TreeSet;

public class ClearCommand extends AbsCommand{
    public ClearCommand(String name) {
        super(name);
    }

    @Override
    public ObjectResAns doo(String s, TreeSet<SpaceMarine> mySet, String user){
        mySet.clear();

        return new ObjectResAns("Collection is cleaned!", true, user);
    }

    @Override
    public String des(){
        return "clear : очистить коллекцию";
    }
}
