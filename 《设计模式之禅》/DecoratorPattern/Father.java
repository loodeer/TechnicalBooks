/**
 * @author loodeer
 * @date 2019-02-14 00:23
 */
public class Father {
    public static void main(String[] args) {
        // 把成绩单拿过来
        SchoolReport schoolReport;
        // 原装的成绩单，直接给老爸看这个会挨打的，全部只有 60 分
        schoolReport = new FouthGradeSchoolReport();
        // 加了最高分
        schoolReport = new HighScoreDecorator(schoolReport);
        // 加了排名
        schoolReport = new SortDecorator(schoolReport);
        // 看成绩单
        schoolReport.report();
        // 考的不错，签上名
        schoolReport.sign("孩他爹");
    }
}
