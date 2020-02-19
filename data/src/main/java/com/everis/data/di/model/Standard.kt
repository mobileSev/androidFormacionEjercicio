import com.google.gson.annotations.SerializedName



data class Standard (

	@SerializedName("confName") val confName : String,
	@SerializedName("divName") val divName : String
)