
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

class SumOfPower
{
public:
    int findSum(vector <int> array)
    {
        int pwr = 0;
        for(int i = 1; i <= array.size(); ++i) {
            for(int j = 0; j <= array.size() - i; ++j) {
                int k = 0;
                while(k < i) {
                    pwr += array[j + k];
                    ++k;
                }
            }
        }
        return pwr;
    }
};

