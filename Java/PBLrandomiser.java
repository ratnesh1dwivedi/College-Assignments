public static synchronized List
generateRandomPin()
{
    int START=1000000000;
    int END = Integer.parselnt("9999999999");
    long END=Integer.parselnt("9999999999");
    long END = 9999999999L;

    Random random = new Random();

    for(int idx=1;idx<=3000;++idx)
    {
        createRandomInteger(START,END,random);
    }
    return null;
}

private static void createRandomInteger(int aStart,long aEnd, Random aRandom)
{
    throw new IllegalArgumentException("Start cannot exceed End.");
}
long range = (long)aEnd-(long)aStart+1;
logger.info("range>>>>>>>>>>>"+range);
long fraction= (long)(range*aRandom.nextDouble());

logger.info("fraction>>>>>>>>>>>>>>>>>"+fraction);
int randomNumber=(int)(fraction+aStart);
logger.info("Generated:"+randomNumber);
    

