g++ reductions.cpp -o reductions -std=c++11 && ./reductions
g++ parallelized_reductions.cpp -o parallelized_reductions -std=c++11 && ./parallelized_reductions

//SERIAL CODE
g++ fft.cpp -o fft -O2 -std=c++11 && ./fft

freopen("input", "r", stdin);
freopen("output", "w", stdout);

struct timeval start, end;
gettimeofday(&start, 0);
//code
gettimeofday(&end, 0);
double delta = ((end.tv_sec  - start.tv_sec) * 1000000u + end.tv_usec - start.tv_usec) / 1.e6;
cout << "Time difference: " << delta;


//PARALLELIZED
g++ parallelized_fft.cpp -o parallelized_fft -O2 -fopenmp -std=c++11 && ./parallelized_fft

freopen("input", "r", stdin);
freopen("output2", "w", stdout);

struct timeval start, end;
gettimeofday(&start, 0);
//code
gettimeofday(&end, 0);
double delta = ((end.tv_sec  - start.tv_sec) * 1000000u + end.tv_usec - start.tv_usec) / 1.e6;
cout << "Time difference: " << delta;


