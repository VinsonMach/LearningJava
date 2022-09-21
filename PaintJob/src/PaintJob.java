// Vinson Mach
// 09/20/2022
// In this program, we do a challenge where we calculate the number of paint buckets we need with various parameters

public class PaintJob
{
    // This method calculates the number of paint buckets needed with height, width, areaPerBucket and any extra buckets
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets)
    {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
        {
            return -1;                                                          // return -1 if invalid values
        }

        int numBuckets = (int) Math.ceil((width * height) / areaPerBucket);     // calculate number of buckets needed
        numBuckets -= extraBuckets;                                             // subtract the extra buckets from needed buckets
        return numBuckets;                                                      // return number of needed buckets
    }

    // This method calculates the number of paint buckets needed with height, width and areaPerBucket
    public static int getBucketCount (double width, double height, double areaPerBucket)
    {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
        {
            return -1;                                                          // return -1 if invalid values
        }

        return (int) Math.ceil((width * height) / areaPerBucket);               // return number of needed buckets
    }

    // This method calculates the number of paint buckets needed with area and areaPerBucket
    public static int getBucketCount (double area, double areaPerBucket)
    {
        if (area <= 0 || areaPerBucket <= 0)
        {
            return -1;                                                          // return -1 if invalid values
        }

        return (int) Math.ceil(area / areaPerBucket);                           // return number of needed buckets
    }
}