package fiji.plugin.trackmate.features.spot;

import mpicbg.imglib.image.Image;
import mpicbg.imglib.type.numeric.RealType;

public abstract class AbstractSpotFeatureAnalyzer <T extends RealType<T>> implements SpotFeatureAnalyzer<T> {
	
	/** The image data to operate on. */
	protected Image<T> img;
	/** The spatial calibration of the field {@link #img} */
	protected  float[] calibration;

	@Override
	public void setTarget(Image<T> image, float[] calibration) {
		this.img = image;
		this.calibration = calibration;
	}

}