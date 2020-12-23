import org.mongodb.scala.MongoClient
import org.bson.codecs.configuration.CodecRegistries.{fromProviders,fromRegistries}
import java.util.concurrent.TimeUnit
import scala.concurrent.duration._

object MongoHelper {
    /**
    val client = MongoClient()
    val db = client.getDatabase("testmongo")
    val res = db.getCollection("congress").find().first().head()
    println(db.getCollection("state").find().toString())
    Await.result(res, Duration(10, TimeUnit.SECONDS)).foreach(println)
    */
}