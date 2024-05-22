package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    // 검증로직 -> 실행로직 (분리)
    MaxCounter(int max){
        this.max = max;
    }
    public void increment(){
        if(isMax(count)){
            count +=1;
        } else {
            System.out.println("최대값 이상으로 수의 크기가 커질 수 없습니다.");
        }
    }

    private boolean isMax(int count){
        return max > count; // true
    }
    public int getCount(){
        return count;
    }
}
