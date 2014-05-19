
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

class CandidatesSelectionEasy
{
public:
    vector<int> sort(vector<string> score, int x) {
        vector< pair<char, int> > vals;
        FOR(i, 0, score.size()) {
            vals.push_back(make_pair(score[i][x], i));
        }

        std::sort(ALL(vals));

        vector<int> ans;
        FOR(i, 0, vals.size()) {
            ans.push_back(vals[i].second);
        }
        return ans;
    }
};

