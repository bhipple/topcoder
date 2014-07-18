
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

class ManySquares
{
public:
    int howManySquares(vector <int> sticks)
    {
        sort(sticks.begin(), sticks.end());

        int cnt = 0;
        int k = 1;
        int last = sticks[0];
        for(int i = 1; i < sticks.size(); ++i) {
            if(sticks[i] == last) {
                if(++k == 4) {
                    k = 0;
                    ++cnt;
                }
            }
            else {
                k = 1;
                last = sticks[i];
            }
        }
        return cnt;
    }
};

