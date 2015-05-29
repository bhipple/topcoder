
// {{{ $VIMCODER$ <-----------------------------------------------------
// vim:filetype=cpp:foldmethod=marker:foldmarker={{{,}}}

#include <algorithm>
#include <bitset>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <ctime>
#include <deque>
#include <functional>
#include <iomanip>
#include <iostream>
#include <limits>
#include <list>
#include <map>
#include <memory>
#include <numeric>
#include <queue>
#include <set>
#include <sstream>
#include <stack>
#include <utility>
#include <vector>

using namespace std;

// }}}

#define ZERO(a) memset(a, 0, sizeof(a))
#define FOR(x,to) for(x=0;x<to;++x)
#define ITR(x,c) for(__typeof(c.begin()) x=c.begin();x!=c.end();++x)

class SortishDiv2
{
public:
    int sortTar;

    int hitsTarget(const vector<int> seq) {
        int score = 0;
        for(size_t i = 0; i < seq.size() - 1; ++i) {
            for(size_t j = i+1; j < seq.size(); ++j) {
                if(seq[i] < seq[j]) { ++score; }
            }
        }
        if(score == sortTar) {
            return 1;
        }
        return 0;
    }

    int backtracker(vector<int> seq, vector<int> missing) {
        int firstZero = -1;
        for(size_t i = 0; i < seq.size(); ++i) {
            if(seq[i] == 0) {
                firstZero = i;
                break;
            }
        }

        if(firstZero == -1) {
            return hitsTarget(seq);
        }

        int successes = 0;
        for(size_t i = 0; i < missing.size(); ++i) {
            seq[firstZero] = missing[i];
            auto missingCopy = missing;
            missingCopy.erase(missingCopy.begin() + i);
            successes += backtracker(seq, missingCopy);
        }

        return successes;
    }

    int ways(int sortedness, vector <int> seq)
    {
        sortTar = sortedness;
        int zeroCt = 0;
        vector<bool> seen(seq.size() + 1);
        for(auto x : seq) {
            if(x == 0) ++zeroCt;
            seen[x] = true;
        }

        if(zeroCt == 0) { return hitsTarget(seq); }

        vector<int> missing;
        for(size_t i = 0; i < seen.size(); ++i) {
            if(!seen[i]) {
                missing.push_back(i);
            }
        }

        return backtracker(seq, missing);
    }
};

