
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

class GoodCompanyDivTwo
{
public:
	int countGood(vector <int> superior, vector <int> workType)
	{
        int diverse = 0;

        for(int i = 0; i < superior.size(); ++i) {
            vector<bool> workHash(101, false);
            workHash[workType[i]] = true;

            bool thisDiverse = true;
            for(int j = i+1; j < superior.size(); ++j) {
                if(superior[j] == i) {
                    if(workHash[workType[j]])
                        thisDiverse = false;
                    workHash[workType[j]] = true;
                }
            }
            if(thisDiverse)
                ++diverse;
        }
		return diverse;
	}
};

