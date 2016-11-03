package No1;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 题目要求：
 * 0. 在个人仓库下，创建分支yourname_ex1
 * 1. 在个人分支下，修改Answers.md文件，里面填入当输入为'2016-11-11 11:11:11'时，输出的值是多少
 * 2. 对代码进行注释，说明每行代码的作用，把代码提交到个人分支下
 * 3. 创建pull request，与主仓库的master分支对比
 */
public class TimestampTransfer {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		//system.in是一条管道
		Scanner scanner = new Scanner(System.in);
		//对时间进行解析，返回data
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//定义输出格式
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//hasnext判断数据流输入是否为空
		while (scanner.hasNext()){
			String line = scanner.nextLine();//输入字符串储存到line中
			Date lineDate = null;//初始化linedata
			long lineTimestamp;//长整型变量lintimestamp
			try {
				lineDate = inputFormat.parse(line);
				lineTimestamp = lineDate.getTime();
				System.out.println(outputFormat.format(lineDate) + " to " + lineTimestamp);//parse方法解析line 返回19701.1午时到输入日期的毫秒数
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();//抛出异常
			}
		}
	}
}
