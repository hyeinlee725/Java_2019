public class DataSumAverage {
  public static int[][] data={
    {74425, 76326},
    {61164, 61636},
    {109688, 115744},
    {144796, 146776},
    {174996, 181676},
    {177841, 177434},
    {204630, 205980},
    {223373, 232245},
    {161055, 166130},
    {171576, 176735},
    {279169, 293772},
    {239450, 251066},
    {148690, 156510},
    {182977, 196992},
    {237792, 242641},
    {283869, 296762},
    {209344, 210282},
    {118965, 114441},
    {186503, 186856},
    {195734, 203014},
    {254381, 249472},
    {212401, 229111},
    {271654, 295354},
    {319197, 335045},
    {229829, 231671}
};
  public static int[] getSum() {
    int[] sum={0,0};
    for(int[] s:data) {
      sum[0] += s[0];
      sum[1] += s[1];
    }
    return sum;
  }
  public static int[] getAverage(int[] s) {
    int[] average={0,0};
    average[0] = s[0]/data.length;
    average[1] = s[1]/data.length;
    return average;
  }
  public static void main(String[] args) {
    DataSumAverage dsa=new DataSumAverage();
    int[] sum=getSum();
    int[] average=getAverage(sum);
    System.out.printf("sumM:%d\nsumF:%d",sum[0],sum[1]);
    System.out.printf("\naverageM:%d\naverageF:%d",average[0],average[1]);
  }
}
