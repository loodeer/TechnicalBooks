package com.loodeer.pattern.command.eg1;

/**
 * @author loodeer
 * @date 2019-02-21 23:14
 */
public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();
    public abstract void execute();
}
