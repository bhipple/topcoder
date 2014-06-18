
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
#include <limits>
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

class BuildingHeightsEasy
{
public:
    vector<pair<int, int> > hts;

    int minimum(int M, vector <int> heights)
    {
        sort(heights.begin(), heights.end());
        for(size_t i = 0; i < heights.size(); ++i) {
            int numBuildsThisHeight = 0;
            int thisHeight = heights[i];
            while(heights[i] == thisHeight) {
                numBuildsThisHeight++;
                i++;
            }
            i--;
            hts.push_back(make_pair(thisHeight, numBuildsThisHeight));
        }

        // [ht, freq]
        int minCost = numeric_limits<int>::max();
        for(int i = hts.size() - 1; i >= 0; --i) {
            if(hts[i].second >= M) {
                return 0;
            }

            int thisHeight = hts[i].first;
            int curFloors = hts[i].second;
            int curCost = 0;
            int j = i-1;
            while(curFloors < M && j >= 0) {
                int floorsToRaise = min(M - curFloors, hts[j].second);
                curCost += floorsToRaise * (thisHeight - hts[j].first);
                curFloors += hts[j].second;
                --j;
            }

            if(curFloors >= M) {
                minCost = min(curCost, minCost);
            }
        }

        return minCost;
    }
};

