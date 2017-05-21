int function (int a, int b) {
}
int function (int a) {
	function(a, b);
}
int main () {
	#pragma omp sections
	{
		#pragma omp section
		{
		int h = 10;

		}
		#pragma omp section
		{
		c = 50;
		d = 6;

		}
		#pragma omp section
		{
		vector<int> v(5);
		a = 10;
		b = a + 15;

		}
	}
	function(a, b + 10);
	function(a);
	for (int i = 0; i < c; ++i) {
        int xd = d;

        while (h < c) {
            a += h;
        }

        d += i;

    }
	function(a);
	function(a);
	int e = 18;
	a = 32;
	b = e + 15;
}
