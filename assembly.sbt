jarName in assembly := "stream_fraud_detecter.jar"


mergeStrategy in assembly <<= (mergeStrategy in assembly) {
  mergeStrategy => {
    case entry => {
      val strategy = mergeStrategy(entry)
      if (strategy == MergeStrategy.deduplicate) MergeStrategy.first
      else strategy
    }
  }}
