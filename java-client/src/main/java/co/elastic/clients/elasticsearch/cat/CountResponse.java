/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.count.CountRecord;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.count.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat.count.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class CountResponse implements JsonpSerializable {
	private final List<CountRecord> valueBody;

	// ---------------------------------------------------------------------------------------------

	private CountResponse(Builder builder) {

		this.valueBody = ApiTypeHelper.unmodifiableRequired(builder.valueBody, this, "valueBody");

	}

	public static CountResponse of(Function<Builder, ObjectBuilder<CountResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<CountRecord> valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (CountRecord item0 : this.valueBody) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CountResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CountResponse> {
		private List<CountRecord> valueBody;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>valueBody</code>.
		 */
		public final Builder valueBody(List<CountRecord> list) {
			this.valueBody = _listAddAll(this.valueBody, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>valueBody</code>.
		 */
		public final Builder valueBody(CountRecord value, CountRecord... values) {
			this.valueBody = _listAdd(this.valueBody, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds a value to <code>valueBody</code> using a builder lambda.
		 */
		public final Builder valueBody(Function<CountRecord.Builder, ObjectBuilder<CountRecord>> fn) {
			return valueBody(fn.apply(new CountRecord.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			List<CountRecord> value = (List<CountRecord>) JsonpDeserializer.arrayDeserializer(CountRecord._DESERIALIZER)
					.deserialize(parser, mapper);
			return this.valueBody(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CountResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CountResponse build() {
			_checkSingleUse();

			return new CountResponse(this);
		}
	}

	public static final JsonpDeserializer<CountResponse> _DESERIALIZER = createCountResponseDeserializer();
	protected static JsonpDeserializer<CountResponse> createCountResponseDeserializer() {

		JsonpDeserializer<List<CountRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(CountRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(),
				(parser, mapper) -> new Builder().valueBody(valueDeserializer.deserialize(parser, mapper)).build());
	}

}
