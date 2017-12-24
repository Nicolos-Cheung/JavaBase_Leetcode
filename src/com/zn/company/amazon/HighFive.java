package com.zn.company.amazon;

/**
 * 每个学生有两个属性 id 和 scores。找到每个学生最高的5个分数的平均值。
 * 
 * @author ning
 *
 */
public class HighFive {

//	public static Map<Integer, Double> getHighFive(List<Node> scores) {
//		Map<Integer, PriorityQueue<Integer>> scoreMap = new HashMap<Integer, PriorityQueue<Integer>>(); for(Node s : scores){
//		scoreMap.putIfAbsent(s.id, new PriorityQueue<Integer>(5)); PriorityQueue<Integer> ss = scoreMap.get(s.id); ss.offer(s.score);
//		if(ss.size() > 5) ss.poll();
//		}
//		Map<Integer, Double> avgHighScore = new HashMap<Integer, Double>(); for(int id : scoreMap.keySet()){
//		}
//		}return avgHighScore;
//
//	PriorityQueue<Integer> pq = scoreMap.get(id);
//	double sum = 0;for(
//	double s:pq)sum+=s;avgHighScore.put(id,sum/5);

}

class Student{
	public String id;
	public String scores;
}