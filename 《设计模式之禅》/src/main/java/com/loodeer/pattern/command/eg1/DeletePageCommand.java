package com.loodeer.pattern.command.eg1;

/**
 * @author loodeer
 * @date 2019-02-21 23:25
 */
public class DeletePageCommand extends Command{
    @Override public void execute() {
        super.rg.find();
        super.rg.delete();
        // 需求组给出计划
        super.rg.plan();
    }
}
