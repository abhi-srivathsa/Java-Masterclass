public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double totalArea = height * width;
        int bucketsNeeded = (int) Math.ceil(totalArea / areaPerBucket);
        int bucketsToBuy = bucketsNeeded - extraBuckets;
        return bucketsToBuy;


    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double totalArea = height * width;
        int bucketsNeeded = (int) Math.ceil(totalArea / areaPerBucket);
        return bucketsNeeded;


    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int bucketsNeeded = (int)Math.ceil(area / areaPerBucket);
        return bucketsNeeded;


    }

}
