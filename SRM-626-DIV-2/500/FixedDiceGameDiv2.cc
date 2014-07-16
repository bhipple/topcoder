
// {{{ $VIMCODER$ <-----------------------------------------------------
// vim:filetype=cpp:foldmethod=marker:foldmarker={{{,}}}

#include <algorithm>
#include <bitset>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <ctime>
#include <deque>
#include <functional>
#include <iomanip>
#include <iostream>
#include <limits>
#include <list>
#include <map>
#include <numeric>
#include <queue>
#include <set>
#include <sstream>
#include <stack>
#include <utility>
#include <vector>

using namespace std;

// }}}

class FixedDiceGameDiv2
{
public:
    double getExpectation(int a, int b)
    {
        double rollSum = 0;
        int rolls = 0;

        for(int i = 1; i <= b; ++i) {
            int minRoll = i+1;
            if(minRoll > a) break;
            if(minRoll == a) {
                ++rolls;
                rollSum += a;
                break;
            }

            for(int j = minRoll; j <= a; ++j) {
                ++rolls;
                rollSum += j;
            }
        }

        return rollSum / rolls;
    }
};

