import com.google.protobuf.ByteString
import com.trueaccord.proto.e2e.bytes._
import org.scalatest._

class BytesSpec extends FlatSpec with MustMatchers {

  "fromFieldsMap" should "work when empty" in {
    val b = ByteMessage()
    ByteMessage.fromFieldsMap(b.getAllFields) must be(b)
  }

  "fromFieldsMap" should "work when non-empty" in {
    val b = ByteMessage(s = ByteString.copyFrom(Array[Byte](17, 54)))
    ByteMessage.fromFieldsMap(b.getAllFields) must be(b)
  }
}

