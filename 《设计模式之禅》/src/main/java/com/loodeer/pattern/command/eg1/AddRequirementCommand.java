package com.loodeer.pattern.command.eg1;

/**
 * @author loodeer
 * @date 2019-02-21 23:27
 */
public class AddRequirementCommand extends Command{
    @Override public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
