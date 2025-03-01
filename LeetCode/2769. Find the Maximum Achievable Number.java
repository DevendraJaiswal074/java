//https://leetcode.com/problems/find-the-maximum-achievable-number/

int theMaximumAchievableX(int num, int t) {
    int max_num = num;
    for(int i =0; i<t+t ; i++){
        num--;
        max_num++;
    }
    return max_num;
}