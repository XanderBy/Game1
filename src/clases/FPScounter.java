package clases;

public final class FPScounter {
	private static int startTime;  
    private static int endTime;  
    private static int frameTimes = 0;  
    private static short frames = 0;  
  

    public final static void StartCounter()  
    {  
        startTime = (int) System.currentTimeMillis();  
    }  


    public final static void StopAndPost()  
    {  
        endTime = (int) System.currentTimeMillis();  
        frameTimes = frameTimes + endTime - startTime;  
        ++frames;  
        // 1000 es 1 segundo 
        if(frameTimes >= 1000)  
        {  
            frames = 0;  
            frameTimes = 0;  
        }  
    }


	public static int getStartTime() {
		return startTime;
	}


	public static void setStartTime(int startTime) {
		FPScounter.startTime = startTime;
	}


	public static int getEndTime() {
		return endTime;
	}


	public static void setEndTime(int endTime) {
		FPScounter.endTime = endTime;
	}


	public static int getFrameTimes() {
		return frameTimes;
	}


	public static void setFrameTimes(int frameTimes) {
		FPScounter.frameTimes = frameTimes;
	}


	public static short getFrames() {
		return frames;
	}


	public static void setFrames(short frames) {
		FPScounter.frames = frames;
	}  
    
    
    
    
}
