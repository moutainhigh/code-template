
package com.itheima.code.util;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * @title :日期转换工具
 * @description :包含常用日期格式转换操作
 * 
 */
public class DateUtil {
	/**
	 * yyyyMMdd转yyyy-MM-dd
	 * @param ymd
	 * @return
	 */

	public static String erpDateFormat(String ymd) {
		if (ymd.length()<8)
			return ymd;
		String time=ymd.substring(0,4)+"-"+
				ymd.substring(4,6)+"-"+
				ymd.substring(6,8);
		return time;//返回获取的日期
	}

	
	/**
	 *  @description:获取当前日期的昨日
	 *  
	 */
	public static String getLastDate(String format) {
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.DATE, -1);
		return dateFormat.format(nowdate.getTime());//返回获取的日期
	}

	
	/**
	 *  @description:获取当前日期的后天
	 * 
	 */
	public static String getNext2Date(String format) {
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.DATE, +2);
		return dateFormat.format(nowdate.getTime());//返回获取的日期
	}
	/**
	 *  @description:获取日期的昨日
	 *  
	 */
	
	public static String getLastDate(Date date,String format){
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		if(date!=null){
			nowdate.setTime(date);
		}
		nowdate.add(Calendar.DATE, -1);
		return dateFormat.format(nowdate.getTime());//返回获取的日期
	}
	/**
	 *  @description:获取当前日期
	 *  
	 */
	public static String getNowDate(String format) {
		Date nowDate=new Date();//获取当前日期
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);//定义日期格式
		return dateFormat.format(nowDate);//返回获取的日期
	}
	
	/**
	 * 获取当前日期的第二天
	 * @param format 指定格式
	 * @return
	 */
	public static String getTomorrowDate(String format) {
		
		Date date=new Date();//取时间
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
		date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		String dateString = formatter.format(date);
		return dateString;
	}

    /** 获取系统当前时间 * */
    public static long getTime() {
        Date dt = new Date();
        return dt.getTime();
    }

    /** 得到系统当前年 **/
    public static int getYear() {
        Calendar mycd = Calendar.getInstance();
        return mycd.get(Calendar.YEAR);
    }

    /** 得到系统当前月 **/
    public static int getMonth() {
        Calendar mycd = Calendar.getInstance();
        return mycd.get(Calendar.MONTH) + 1;
    }

    /** 得到系统当前日 * */
    public static int getDate() {
        Calendar mycd = Calendar.getInstance();
        return mycd.get(Calendar.DATE);
    }
    
    /**
     * 得到系统当前时
     * @return
     */
    public static int getHour() {
        Calendar mycd = Calendar.getInstance();
        return mycd.get(Calendar.HOUR_OF_DAY);
    }
    /**
     * 得到系统当周的某天
     * @return
     */
    public static int getDayOfWeek() {
        Calendar mycd = Calendar.getInstance();
        return mycd.get(Calendar.DAY_OF_WEEK);
    }
  
	/**
	 *  @description:根据日期的类型封装为String对象
	 *  
	 */
	public static String getUtilDateString(Date date, String format) {
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);//定义日期格式
		String temp="";
		temp = dateFormat.format(date);
		return temp;
	}

	/**
	 *  @description:根据日期的字符串封装为Date对象
	 * 
	 */
	public static Date getUtilDate(String datestr, String format) {
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);//定义日期格式
		Date date=null;
			try {
				date=dateFormat.parse(datestr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return date;
	}
	
	/**
	 * 转化成月份
	 * @param time
	 * @return
	 */
	public static String StringDayToMonth (String time) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
		String monthStr = "";
		try {
			monthStr = sf.format(sf.parse(time));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return monthStr;
	}
	
	
	/**
	 *  @description:获取日期的上个月当天(yyyy-MM-dd)
	 *  @param format 格式
	 *  
	 */
	public static String getLastMonthDate(Date date,String format) {
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		//update by yunjie at 20110410
		if(date != null){
			nowdate.setTime(date);
		}
		//update end
		nowdate.add(Calendar.MONTH, -1);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 *  @description:获取日期的上个月当天(yyyy-MM-dd)
	 *  @param
	 *  
	 */
	public static String getLastMonthDate(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.MONTH, -1);
		return dateFormat.format(nowdate.getTime());
	}

	/**
	 *  @description:获取日期的下个月当天(yyyy-MM-dd)
	 * 
	 */
	public static String getNextMonthDate(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.MONTH, 1);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 *  @description:获取日期的下个月当天(yyyy-MM-dd)
	 * 
	 */
	public static String getNextMonthDate(Date date,String format) {
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		//update by lit
		if(date != null){
			nowdate.setTime(date);
		}
		//update end
		nowdate.add(Calendar.MONTH, 1);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * @description:获取日期的去年当天(yyyy-MM-dd)
	 * 
	 * @param date
	 * 
	 * @return
	 */
	public static String getLastYearDate(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.YEAR, -1);
		return dateFormat.format(nowdate.getTime());
	}

	/**
	 *  @description:获取日期的明年当天(yyyy-MM-dd)
	 *  
	 */
	public static String getNextYearDate(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.YEAR, 1);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * 获取日期的本周周一(yyyy-MM-dd)
	 * 
	 */
	public static String getWeekMonday() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.set(Calendar.DAY_OF_WEEK,2);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * 获取日期的周一(yyyy-MM-dd)
	 * 
	 */
	public static String getWeekMonday(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.setTime(date);
		nowdate.set(Calendar.DAY_OF_WEEK,2);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * 获取日期的本周周末(yyyy-MM-dd)
	 * 
	 */
	public static String getWeekSunday() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.WEEK_OF_MONTH,1);
		nowdate.set(Calendar.DAY_OF_WEEK,1);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * 获取日期的周末(yyyy-MM-dd)
	 * 
	 */
	public static String getWeekSundy(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.setTime(date);
		nowdate.add(Calendar.WEEK_OF_MONTH,1);
		nowdate.set(Calendar.DAY_OF_WEEK,1);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * 获取日期的本月月初(yyyy-MM-dd)
	 * 
	 */
	public static String getMonthFirstDay() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.set(Calendar.DAY_OF_MONTH,1);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * 获取日期的上月月初(yyyy-MM-dd)
	 * 
	 */
	public static String getLastMonthFirstDay() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.MONTH,-1);
		nowdate.set(Calendar.DAY_OF_MONTH,1);
		return dateFormat.format(nowdate.getTime());
	}
	
	/**
	 * 获取日期的月初(yyyy-MM-dd)
	 * 
	 */
	public static String getMonthFirstDay(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.setTime(date);
		nowdate.set(Calendar.DAY_OF_MONTH,1);
		return dateFormat.format(nowdate.getTime());
	}
	
	/**
	 * 获取日期的上月月末(yyyy-MM-dd)
	 * 
	 */
	public static String getLastMonthEndDay() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.set(Calendar.DAY_OF_MONTH,1);
		nowdate.add(Calendar.DAY_OF_MONTH, -1);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * 获取日期的本月月末(yyyy-MM-dd)
	 *
	 */
	public static String getMonthEndDay() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.MONTH,1);
		nowdate.set(Calendar.DAY_OF_MONTH,1);
		nowdate.add(Calendar.DAY_OF_MONTH, -1);
		return dateFormat.format(nowdate.getTime());
	}
	
	/**
	 * 获取日期的月末(yyyy-MM-dd)
	 * 
	 */
	public static String getMonthEndDay(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.setTime(date);
		nowdate.add(Calendar.MONTH,1);
		nowdate.set(Calendar.DAY_OF_MONTH,1);
		nowdate.add(Calendar.DAY_OF_MONTH, -1);
		return dateFormat.format(nowdate.getTime());
	}
	
	/**
	 * 获取指定和格式日期的月末(yyyy-MM-dd)
	 * 
	 */
	public static String getMonthEndDay(Date date,String format) {
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.setTime(date);
		nowdate.add(Calendar.MONTH,1);
		nowdate.set(Calendar.DAY_OF_MONTH,1);
		nowdate.add(Calendar.DAY_OF_MONTH, -1);
		return dateFormat.format(nowdate.getTime());
	}
	
	/**
	 * 将string date转化指定格式
	 * @param dateStr
	 * @return
	 */
	public static String stringDateFramat(String dateStr) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String stringDate = "";
		try {
			stringDate = sf.format(sf.parse(dateStr));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return stringDate;
	}
	
	/**
	 * 两天之间的间隔天数[前者-后者]
	 * 
	 */
	public static int dayDiff(Date date1, Date date2) {
		long diffMillseconds=date1.getTime()-date2.getTime();
		int diffDay=(int)(diffMillseconds/1000/60/60/24);
		return diffDay;
	}

	/**
	 * 获取日期处理后的日期
	 * 
	 */
	public static Date getAddedDate(Date date, int addYear, int addMonth,
			int addDay, int addHour, int addMinute, int addSecond) {
		Calendar nowdate=new GregorianCalendar();
		nowdate.setTime(date);
		nowdate.add(Calendar.YEAR,addYear);
		nowdate.add(Calendar.MONTH,addMonth);
		nowdate.add(Calendar.DAY_OF_MONTH,addDay);
		nowdate.add(Calendar.HOUR_OF_DAY,addHour);
		nowdate.add(Calendar.MINUTE,addMinute);
		nowdate.add(Calendar.SECOND,addSecond);
		return nowdate.getTime();
	}
	
	public static Date getAddedDate(int field, int amount)  {
		Calendar nowdate=Calendar.getInstance();
		nowdate.add(field, amount);
		return nowdate.getTime();
	}
	/**
	 * @description:获取日期的第几周（周报固定值）
	 * (yyyy-MM-WW) WW指01-05
	 * @
	 */
   	public static String getMonthWeek(Date date ){
		Calendar nowdate=new GregorianCalendar();
		nowdate.setTime(date);
		nowdate.set(Calendar.DAY_OF_WEEK,6);//设置周五
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-WW");//定义日期格式
   		return dateFormat.format(nowdate.getTime());
   	}

	/**
	 * @description:根据数据据返回的日期类返回类型构造java.util.Date数据
	 * 
	 * @param obj 数据库Date对应JDBC类型实例
	 * @return java.util.Date数据
	 */
	public static Date getUtilDate(Object obj){
		if (obj instanceof java.sql.Date){
			return  new Date(((java.sql.Date)obj).getTime());
		}else if (obj instanceof Timestamp){
			return new Date(((Timestamp)obj).getTime());
		}
		return null;
	}
    /** 得到日期格式为yyyy-mm-dd * */
    public static String getMiddle() {
        return getMiddle("-");
    }
    /** 得到日期格式为YYYY $sStr MM $sStr DD其中sStr为分割字符 * */
    public static String getMiddle(String sStr) {
        Calendar mycd = Calendar.getInstance();
        int year = mycd.get(Calendar.YEAR);
        int month = mycd.get(Calendar.MONTH) + 1;
        int date = mycd.get(Calendar.DATE);
        String re = "" + String.valueOf(year);
        if (month < 10)
            re += sStr + "0" + String.valueOf(month);
        else
            re += sStr + String.valueOf(month);
        if (date < 10)
            re += sStr + "0" + String.valueOf(date);
        else
            re += sStr + String.valueOf(date);
        return re;
    }
    /** 得到日期格式为YYYY $sStr MM 其中sStr为分割字符 * */
    public static String getMiddleYM(String sStr) {
        Calendar mycd = Calendar.getInstance();
        int year = mycd.get(Calendar.YEAR);
        int month = mycd.get(Calendar.MONTH) + 1;
        String re = "" + String.valueOf(year);
        if (month < 10)
            re += sStr + "0" + String.valueOf(month);
        else
            re += sStr + String.valueOf(month);
        return re;
    }
    /** 得到sStr格式日期 * */
    public static String getAll(String sStr) {
        Calendar mycd = Calendar.getInstance();
        return mycd.get(Calendar.YEAR) + sStr + (mycd.get(Calendar.MONTH) + 1)
                + sStr + mycd.get(Calendar.DATE);
    }
    /**
     * 获取当前年月的前年*月或者后年*月
     * @param i
     * @return
     */
    public static String getDateMonthTime(int i){
		Date date=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMM");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		if(date!=null){
			nowdate.setTime(date);
		}
		nowdate.add(Calendar.MONTH, i);
		String time=dateFormat.format(nowdate.getTime());
		return time;
    }
    
    /**
     * Date转换为Timestamp
     * @param date
     * @return
     */
    public static Timestamp dateToTimestamp(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (date == null) {
			date = new Date();
		}
		String time = sdf.format(date);
		return Timestamp.valueOf(time);
	}

	/**
	 * 
	 * @description: 时间转string
	 * @param date java.util.Date
	 * @param   : String
	 * @return：String字符串
	 */
	public static String Date2String(Date date,String formatModle) {
		if(date!=null) {
			return new SimpleDateFormat(formatModle).format(date);
		}else 		return null;
	}
	
	/**
	 * 新增方法
	 * 2013-11-13 16:03:38
	 */
    /**
     * 获取当前年月的上个月
     * @param 
     * @return
     */
    public static String getLastYm() {
    	try {
    		Calendar calendar = Calendar.getInstance();
        	if(isGetLastMonthData()) {
        		calendar.add(Calendar.MONTH, -1);
        	}else {
        		calendar.add(Calendar.MONTH, -2);
        	}
    		SimpleDateFormat simpleDf = new SimpleDateFormat("yyyyMM");
    		String date = simpleDf.format(calendar.getTime());
    		return date;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
    }
	/**
	 * hands
	 * 新增方法
	 * 2013-11-13 16:03:38
	 */
    /**
     * 获取当前年月的上个月(不涉及当月前5天算上上月)
     * @param 
     * @return
     */
    public static String getRealLastYm() {
    	try {
    		Calendar calendar = Calendar.getInstance();
        	calendar.add(Calendar.MONTH, -1);
    		SimpleDateFormat simpleDf = new SimpleDateFormat("yyyyMM");
    		String date = simpleDf.format(calendar.getTime());
    		return date;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
    }
    /**
     * 获取当前年月的上个月
     * @param 
     * @return
     */
    public static String getLastYmd() {
    	try {
    		Calendar calendar = Calendar.getInstance();
        	if(isGetLastMonthData()) {
        		calendar.add(Calendar.MONTH, -1);
        	}else {
        		calendar.add(Calendar.MONTH, -2);
        	}
    		SimpleDateFormat simpleDf = new SimpleDateFormat("yyyyMMdd");
    		String date = simpleDf.format(calendar.getTime());
    		return date;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
    }
    /**
     * 判断日期取上个月或者上上个月的数据
     * @param 
     * @return
     */
    public static boolean isGetLastMonthData(){
    	try{
    		Properties pro=new Properties();
//        	pro.load(This.class.getClassLoader().getResourceAsStream("system.properties"));
        	Integer date= 5;
        	Calendar calendar = Calendar.getInstance();
        	int day = calendar.get(Calendar.DATE);
        	System.out.print(day);
        	if(day<=date){
        		return false;
        	}else {
        		return true;
        	}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return true;
    }
    
    /**
     * 当前日期往前推12个月的数据
     * @param 
     * @return
     */
    public static String[] getLastTweenMonth() throws Exception{
    	Calendar calendar  = Calendar.getInstance();
		String months[] = new String[12];
		int month = 0;
		if(isGetLastMonthData()) {
			calendar.add(Calendar.MONTH,-1);
			month = calendar.get(Calendar.MONTH) +1;
		} else {
			calendar.add(Calendar.MONTH,-2);
			month = calendar.get(Calendar.MONTH)  + 1;
		}
		int year = calendar.get(Calendar.YEAR);
		for(int i =11;i>=0;i--) {
			if(month == 0) {
				year = year-1;
				month = 12;
			}
			months[i] = year+ "" + (month<10?"0"+month:month);
			month--;
		}
		return months;
    }
    
    /**
     * 根据当前年份日期往前推12个月的数据
     * @param  (:2012)
     * @return
     */
    public static String[] getTweenMonthByYear(int year) throws Exception{
    	Calendar calendar  = Calendar.getInstance();
		String months[] = new String[12];
		int month = 0;
		if(isGetLastMonthData()) {
			calendar.add(Calendar.MONTH,-1);
			month = calendar.get(Calendar.MONTH) +1;
		} else {
			calendar.add(Calendar.MONTH,-2);
			month = calendar.get(Calendar.MONTH)  + 1;
		}
		for(int i =11;i>=0;i--) {
			if(month == 0) {
				year = year-1;
				month = 12;
			}
			months[i] = year+ "" + (month<10?"0"+month:month);
			month--;
		}
		return months;
    }
    
    /**
     * 功能：根据当前日期往前推5个年份
     * @return
     */
    public static int[] getFiveYearByCurrentYear(){
    	Calendar calendar  = Calendar.getInstance();
		int years[] = new int[5];
		//当前年份
		int curentYear = calendar.get(Calendar.YEAR);
		System.out.println("currentYear="+curentYear);
		int j = 0 ;
		for(int i = 4 ; i >= 0 ; i-- ){
			years[j] = curentYear - i;
			j++ ;
		}
		System.out.println("years.length=="+years.length);
    	return years ;
    }
    
    /**
     * 功能：获取某年的奇数月份
     * @param 
     * @return
     */
    private static String[] getOddNumber(String year){
    	String[] months = new String[6];
    	int monthTep = 0    ;
    	int month = 0 ;
    	for(int i = 0 ; i < 12 ; i++ ){
    		month = i + 1 ;
    		if( month < 10 ){
    			months[monthTep] = year + "0" + month ;
    		}else {
    			months[monthTep] = year + month ;
    		}
    		i++ ;
    		monthTep++;
    	}
    	return months ;
    }
    
    /**
     * 功能：根据当年的时候往前推3年的时间
     * @param 
     * @return
     */
    public static String[] getThreeYearTime() throws Exception{
    	Calendar calendar  = Calendar.getInstance();
		String months[] = new String[18];
		int month = 0;
		//当前年份
		int curentYear = calendar.get(Calendar.YEAR);
		
		String[] qianNian = getOddNumber(curentYear -2  + "");
		for(int i = 0 ; i < qianNian.length ; i++ ){
			months[i] = qianNian[i];
		}

		String[] quNian = getOddNumber(curentYear -1  + "");
		for(int j = 0 ; j < qianNian.length ; j++ ){
			months[6+j] = quNian[j];
		}
		String[] thisYear = getOddNumber(curentYear  + "" );
		for(int k = 0 ; k < qianNian.length ; k++ ){
			months[12 + k] = thisYear[k];
		}
		return months;
    }
    
    
    /**
     * 传入日期往前推12个月的数据
     * @param 
     * @return
     */
    public static String[] getLastTweenMonth(int month) throws Exception{
    	Calendar calendar  = Calendar.getInstance();
		String months[] = new String[12];
		int year = calendar.get(Calendar.YEAR);
		for(int i =11;i>=0;i--) {
			if(month == 0) {
				year = year-1;
				month = 12;
			}
			months[i] = year+ "" + (month<10?"0"+month:month);
			month--;
		}
		return months;
    }
    
    
    /**
     * 功能：获取三年的月份
     * @return
     */
    public static String[] getThreeYearMonth() throws Exception{
    	Calendar calendar  = Calendar.getInstance();
		String months[] = new String[36];
		//今年
		int year = calendar.get(Calendar.YEAR);
		String[] years = new String[3];
		years[0] = year - 2 + "" ;
		years[1] = year - 1 + "" ;
		years[2] = year + "" ;
		int k = 0 ;
		for(int i=0 ; i < years.length ; i++ ){
			String curentYear = years[i];
			for(int j=1 ; j < 13 ; j++ ){
			    if( j < 10 ){
			    	months[k] = curentYear + "0" + j ;
			    }else{
			    	months[k] = curentYear + j ;
			    }
				k ++ ;
			}
		}
		return months;
    }
    
    
    /**
	 *  @description:获取当前日期的昨日
	 */
	public static String getLastDate() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMMdd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.DATE, -1);
		return dateFormat.format(nowdate.getTime());//返回获取的日期
	}
	/**
     * 获取当前日期的上个季度
     * @param 
     * @return
     */
    public static String getLastQuarter() {
    	Calendar calendar  = Calendar.getInstance();
		int month=calendar.get(Calendar.MONTH)+1;
		int year=calendar.get(Calendar.YEAR);
		String quarter="";
		switch(month){
		case 1:case 2:case 3:quarter=(year-1)+"Q4";break;
		case 4:case 5:case 6:quarter=year+"Q1";break;
		case 7:case 8:case 9:quarter=year+"Q2";break;
		case 10:case 11:case 12:quarter=year+"Q3";break;
		default:break;
		}
		return quarter;
    }
    /**
     * 获取当前日期的季度,日期格式为yyyyMMdd
     * @param 
     * @return
     */
    public static String getQuarter(String date) {
    	int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(4,6));
		String quarter="";
		switch(month){
		case 1:case 2:case 3:quarter=year+"Q1";break;
		case 4:case 5:case 6:quarter=year+"Q2";break;
		case 7:case 8:case 9:quarter=year+"Q3";break;
		case 10:case 11:case 12:quarter=year+"Q4";break;
		default:break;
		}
		return quarter;
    }
    /**
     * 获取当前日期的去年
     * @param 
     * @return
     */
    public static String getLastYear() {
    	Calendar calendar  = Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR)-1;
		return String.valueOf(year);
    }
    
    /** 得到系统当前日期及时间 格式为 yyyy-MM-dd HH:mm:ss * */
    public static String getDateTimeByMinute() {
        return getNowDate("yyyy-MM-dd HH:mm");
    }
    /**
     * 2013Q1
     * @param quarter
     * @return
     */
    public static String getLastQuarter(String quarter) {
		int qu=Integer.parseInt(quarter.substring(5));
		int year=Integer.parseInt(quarter.substring(0,4));
		if(qu==1){
			quarter=(year-1)+"Q4";
		}else{
			quarter=year+"Q"+(qu-1);
		}
		return quarter;
    }
	
    /**
     * 计算两个时间的差值
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @param dateType 方法返回的时间单位，1是天、2是小时、3是分钟、4是秒
     * @param decimalPlace 方法返回的小数点保留多少位
     * @return double类型的字符串，如果为null则入参错误
     */
    public static String getTwoTimeDifference(Date startTime, Date endTime, int dateType, int decimalPlace){
    	double nd = 1000 * 24 * 60 * 60;
	    double nh = 1000 * 60 * 60;
	    double nm = 1000 * 60;
	    double ns = 1000;
	    
	    double  result = -1d;
	    
	 // 获得两个时间的毫秒时间差异
	    long diff = endTime.getTime() - startTime.getTime();
	    if (diff < 0) {
			return null;
		}
		switch (dateType) {
		case 1:
			result =  new BigDecimal(diff/nd).setScale(decimalPlace, BigDecimal.ROUND_HALF_UP).doubleValue();
			break;
		case 2:
			result = new BigDecimal(diff/nh).setScale(decimalPlace, BigDecimal.ROUND_HALF_UP).doubleValue();
			break;
		case 3:
			result = new BigDecimal(diff/nm).setScale(decimalPlace, BigDecimal.ROUND_HALF_UP).doubleValue();
			break;
		case 4:
			result = new BigDecimal(diff/ns).setScale(decimalPlace, BigDecimal.ROUND_HALF_UP).doubleValue();
			break;
		}
		
		if (result == -1d) {
			return null;
		}
    	return String.valueOf(result);
    }
    
    /**
     * 判断同一格式下，第一个时间是否大于第二个时间
     * @param date
     * @param date2
     * @param format 时间格式
     * @return
     */
    public static boolean isGreaterDate(Date date,Date date2, String format){
    	date = DateUtil.String2Date(DateUtil.date2String(date, format), format);
    	date2 = DateUtil.String2Date(DateUtil.date2String(date2, format), format);
    	if (date.getTime() - date2.getTime() > 0) {
			return true;
		}
    	return false;
    }
    
    /**
	 * @description  string转java.util.Date数据
	 * @param sourceString : String
	 * @param  : String
	 * @return java.util.Date数据
	 */
	public static Date String2Date(String sourceString , String formatModle) {
		SimpleDateFormat format=new SimpleDateFormat(formatModle);
		Date date=null;
		try {
			 date=format.parse(sourceString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static String date2String(Date date, String format){
    	String dateStr = null;
    	SimpleDateFormat sdf = new SimpleDateFormat(format);
    	dateStr = sdf.format(date);
    	return dateStr;
    }
	
    /** 
     * 根据开始时间和结束时间返回时间段涉及的日期集合
     *  
     * @param beginDate 
     * @param endDate 
     * @return List 
     */  
    public static List<Date> getDatesBetweenTwoDate(Date beginDate, Date endDate) {
    	if (endDate.getTime() < beginDate.getTime()) {
			return null;
		}
    	
    	beginDate = getUtilDate(date2String(beginDate, "yyyy-MM-dd"), "yyyy-MM-dd");
    	endDate = getUtilDate(date2String(endDate, "yyyy-MM-dd"), "yyyy-MM-dd");
    	
        List<Date> lDate = new ArrayList<Date>();  
        lDate.add(beginDate);// 把开始时间加入集合  
        Calendar cal = Calendar.getInstance();  
        // 使用给定的 Date 设置此 Calendar 的时间  
        cal.setTime(beginDate);  
        boolean bContinue = true;  
        while (bContinue) {  
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量  
            cal.add(Calendar.DAY_OF_MONTH, 1);  
            // 测试此日期是否在指定日期之后  
            if (cal.getTime().after(endDate)) {
            	break;
            } else {  
            	lDate.add(cal.getTime());  
            }  
        }  
        return lDate;  
    } 
    
    /**
     * 判断time是否在startTime，endTime之内
     *
     * @param time 指定日期
     * @param startTime 开始日期
     * @param endTime   结束日期
     * @return
     */
    public static boolean belongCalendar(Date time, Date startTime, Date endTime) {
        Calendar date = Calendar.getInstance();
        date.setTime(time);

        Calendar after = Calendar.getInstance();
        after.setTime(startTime);

        Calendar before = Calendar.getInstance();
        before.setTime(endTime);
        
        if ((date.after(after) && date.before(before)) || date.equals(after) || date.equals(before)) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
	 * 比较两个时间的大小
	 * @param startTime
	 * @param endTime
	 * @param formatType
	 * @return
	 */
	public static int compare_date(String startTime, String endTime, String formatType) {
        DateFormat df = new SimpleDateFormat(formatType);
        try {

            Date dt1 = df.parse(startTime);
            Date dt2 = df.parse(endTime);
            if (dt1.getTime() > dt2.getTime()) {
                //System.out.println("startTime 大于  endTime");
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                //System.out.println("startTime 小于 endTime");
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }
	
	/**
	 * 通过日期获取周几
	 * @param dt
	 * @return
	 */
	public static String getWeekOfDate(String dt) {
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = dateFm.parse(dt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        String[] weekDays = {"7", "1", "2", "3", "4", "5", "6"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }
	
	public static String getCurrentTime(){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = simpleDateFormat.format(new Date());
		return date;
	}
	public static String initDateByDay(Date date,int hour){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		calendar.setTime(date);
		calendar.set(Calendar.HOUR, hour);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return simpleDateFormat.format(calendar.getTime());
	}
}
