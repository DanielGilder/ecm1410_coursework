package cycling.rescources;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap


public class Race{


	private String name;
	private String description;
	private int raceID;
	private int numberOfStages = 0;
	private static int count = 0;
	
	HashMap<Integer, RaceStage> stages = new HashMap<Integer, RaceStage>();
	
	Race(String name, String description){
		this.name  = name;
		this.description = description;
		
		setRaceID(++count)
	}
	
	public void setRaceID(int raceID){
		this.raceID = raceID;
	}
	
	    public int getRaceID() {
          return raceID;
      }
	  
	public int getNoOfStages(){
			return numberOfStages;
	}
	
	
	public int addStage( String stageName, String description, double length, LocalDateTime startTime, StageType type){
			numberOfStages++;
			Stage stage = new Stage(stageName, description, length, startTime, type);
			int stageid = stage.getStageID();
			stages.put(stageID, stage);
			return stageid;
	}
	public int[] getStages(){
		int[] stageIDs = new int[]
		int k = 0;
		for(Integer s : this.stages.ketSet()){
            stageIDs[k] = s;
			k++
		}
		return stageIDs;
	}
	public Map<Integer, RaceStage> getStages(){
		return stages;
		
	}
	
	public double stageLength(int stageID){
			return stages.get(stageID).length();
			
	}
	
	public void removeStage(int stageID){
		stages.remove(stageID);
	}
	
	
	public void addClimbToRace(int stageId, Double location, SegmentType type, Double averageGradient,
			Double length){
		Segment segment = new Segment(int stageId, Double location, SegmentType type, Double averageGradient,
			Double length);
			
		
	}
		}