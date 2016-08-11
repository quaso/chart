/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.options.scales;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BarScale extends CategoryScale {

	/**
	 * @see #setxAxes(List)
	 */
	private List<XAxis> xAxes;

	/**
	 * @see #setyAxes(List)
	 */
	private List<YAxis> yAxes;

	/**
	 * @see #setxAxes(List)
	 */
	public List<XAxis> getxAxes() {
		return xAxes;
	}

	/**
	 * <p>
	 * The bar chart officially supports only 1 x-axis but uses an array to keep
	 * the API consistent. Use a scatter chart if you need multiple x axes.
	 * </p>
	 */
	public void setxAxes(List<XAxis> xAxes) {
		this.xAxes = xAxes;
	}

	/**
	 * @see #setyAxes(List)
	 */
	public List<YAxis> getyAxes() {
		return yAxes;
	}

	/**
	 * 
	 */
	public void setyAxes(List<YAxis> yAxes) {
		this.yAxes = yAxes;
	}

}