
// {{{ Boilerplate Code <--------------------------------------------------
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
#include <list>
#include <map>
#include <numeric>
#include <queue>
#include <set>
#include <sstream>
#include <stack>
#include <utility>
#include <vector>

#define FOR(I,A,B) for(int I = (A); I < (B); ++I)
#define REP(I,N)   FOR(I,0,N)
#define ALL(A)     (A).begin(), (A).end()

using namespace std;

// }}}

class CatchTheBeatEasy
{
public:
    string ableToCatchAll(vector <int> x, vector <int> y)
    {
        int xPos = 0;
        int secs = 0;

        while(x.size()) {
            int min = 0;
            for(int i = 0; i < y.size(); ++i) {
                if(y[i] < y[min])
                    min = i;
            }
            if((y[min] - secs) < abs(x[min] - xPos)) {
                return "Not able to catch";
            }
            secs += (y[min] - secs);
            xPos = x[min];

            x.erase(x.begin() + min);
            y.erase(y.begin() + min);
        }

        return "Able to catch";
    }
};

