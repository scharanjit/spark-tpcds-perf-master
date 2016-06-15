```
	 	 	


1.) Go to project Directory
cd ~/spark-tpcds-perf-master

2.) Use below mentioned command to run the Benchmark
./bin/run - - benchmark DataSetPerformace

A filter can also be added here as per requirement
./bin/run –benchmark DataSetPerformance -f [RDD/DF/DS]

3.) shell script file 'run' present in /bin directory takes DataSetPerformance as benchmark & calls 'runBenchmark' method present in built.sbt file

4.) From their , it will run com.imaginea.spark.tpcds.perf.RunBenchmark class

```
![alt tag](https://github.com/scharanjit/spark-tpcds-perf-master/blob/master/image.png)
```
```` 
RunBenchmark.scala
```
```` 


```
````                              


[<======Click here for Benchmark Info======>](https://docs.google.com/document/d/18iJqSMsXEpuVeKIrG5XwoFhsGJyopI3h0_AA_0CpNPc/edit)
[<=====Click here for Queries Printed=====>](https://docs.google.com/document/d/1V5GycG8MgLG5G_YxpKzPCfrL6eD6ZpyxI_hQ63_S3aU/edit)

   ```
   ````                                
[<========Print Results =========>](https://docs.google.com/document/d/10PqpW7YJC07cngoWTTg5BrURV5WNxmdG1tVLihdoyCI/edit)

```
```` 



````

RESULTS
+-------------------------+-----------+-----------+------------------+------------------+
|name |minTimeMs |maxTimeMs |avgTimeMs |stdDev |
+-------------------------+-----------+-----------+------------------+------------------+
|DF: average |47.960799 |313.363721 |111.85485033333335|101.69894400713125|
|DF: back-to-back filters |3563.834341|3890.313671|3729.322490666667 |144.79335851720703|
|DF: back-to-back maps |3558.042641|6094.951101|4493.597156833333 |1218.834001726762 |
|DF: range |3362.132277|3909.020092|3535.7481248333333|201.09701976931444|
|DS: average |null |null |null |null |
|DS: back-to-back filters |3963.395014|4327.492749|4080.935591 |133.0974179161218 |
|DS: back-to-back maps |3924.290342|4971.057001|4300.867932666667 |386.97942164691403|
|DS: range |3367.217288|5229.879687|4048.0289195000005|751.2382793173442 |
|RDD: average |31.455203 |78.272362 |50.457821833333334|19.901282333856432|
|RDD: back-to-back filters|3366.564213|3790.927985|3519.816471333333 |158.5522180795807 |
|RDD: back-to-back maps |4453.367508|8217.015722|5352.809501166666 |1458.0017511184574|
|RDD: range |1031.137126|1421.512493|1294.06481 |134.89836646075193|
+-------------------------+-----------+-----------+------------------+------------------+


P.S :- Rasie an issue if you need cannpt access google docs

```