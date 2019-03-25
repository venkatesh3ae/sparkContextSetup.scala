// set up spark context
implicit val spark = SparkSession.builder.master("local")
      .appName("California Housing Dataset Prediction").getOrCreate
