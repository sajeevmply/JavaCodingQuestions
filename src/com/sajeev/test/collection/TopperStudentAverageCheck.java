package com.sajeev.test.collection;

import java.util.HashMap;
import java.util.Map;

public class TopperStudentAverageCheck {

	public static void main(String[] args) {
		String[][] stdMarks = {{"jerry","65"},{"bobby","87"},{"jerry","99"},{"jerry","100"},{"erik","65"}};
		Integer maxAverage = findMaxMarkAverage(stdMarks);
		System.out.println("Max Average: "+maxAverage);
	}

	private static Integer findMaxMarkAverage(String[][] stdMarks) {
		Integer maxAverage = 0;
		if(null != stdMarks) {
			Map<String, Mark> stdMarkMap = new HashMap<>();
			for ( int i = 0; i< stdMarks.length; i++) {
				for(int j = 1; j< stdMarks[i].length; j++ ) {
					System.out.print(stdMarks[i][j-1]+ " ");
					System.out.println(stdMarks[i][j]);
					if(stdMarkMap.containsKey(stdMarks[i][j-1])) {
						Mark mark = stdMarkMap.get(stdMarks[i][j-1]);
						mark.setTotalMark(mark.getTotalMark()+Integer.parseInt(stdMarks[i][j]));
						mark.setNoOfSub(mark.getNoOfSub()+1);
						mark.setAverageMark(mark.getTotalMark()/mark.getNoOfSub());
						stdMarkMap.put(stdMarks[i][j-1], mark);
					} else {
						Mark mark = new Mark();
						mark.setTotalMark(Integer.parseInt(stdMarks[i][j]));
						mark.setNoOfSub(1);
						mark.setAverageMark(mark.getTotalMark());
						stdMarkMap.put(stdMarks[i][j-1], mark);
					}
				}
			}
			for(Map.Entry<String, Mark> entry : stdMarkMap.entrySet()) {
				Mark value = entry.getValue();
				if(maxAverage<=value.getAverageMark()) {
					maxAverage = value.getAverageMark();
				}
			}
		}
		return maxAverage;
	}

}

class Mark {
	private Integer totalMark;
	private Integer noOfSub;
	private Integer averageMark;
	public Integer getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(Integer totalMark) {
		this.totalMark = totalMark;
	}
	public Integer getNoOfSub() {
		return noOfSub;
	}
	public void setNoOfSub(Integer noOfSub) {
		this.noOfSub = noOfSub;
	}
	public Integer getAverageMark() {
		return averageMark;
	}
	public void setAverageMark(Integer averageMark) {
		this.averageMark = averageMark;
	}
	
}
