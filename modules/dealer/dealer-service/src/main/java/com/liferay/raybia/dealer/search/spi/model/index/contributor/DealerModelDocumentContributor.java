package com.liferay.raybia.dealer.search.spi.model.index.contributor;

import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import com.liferay.raybia.dealer.constants.DealerConstants;
import com.liferay.raybia.dealer.model.Dealer;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = "indexer.class.name=com.liferay.raybia.dealer.model.Dealer", service = ModelDocumentContributor.class)
public class DealerModelDocumentContributor implements ModelDocumentContributor<Dealer> {

	@Override
	public void contribute(Document document, Dealer dealer) {

		String name = HtmlUtil.extractText(dealer.getName());
		document.addText(Field.NAME, name);

		String state = HtmlUtil.extractText(dealer.getState());
		document.addText(DealerConstants.Field.STATE, state);

		String locality = HtmlUtil.extractText(dealer.getLocality());
		document.addText(DealerConstants.Field.LOCALITY, locality);

		document.addDate(Field.MODIFIED_DATE, dealer.getModifiedDate());

		document.addGeoLocation(dealer.getLatitude().doubleValue(), dealer.getLongitude().doubleValue());

		// Handle localized fields.

		for (Locale locale : LanguageUtil.getAvailableLocales(dealer.getGroupId())) {

			String languageId = LocaleUtil.toLanguageId(locale);

			document.addText(LocalizationUtil.getLocalizedName(Field.NAME, languageId), name);

			document.addText(LocalizationUtil.getLocalizedName(DealerConstants.Field.STATE, languageId), name);

			document.addText(LocalizationUtil.getLocalizedName(DealerConstants.Field.LOCALITY, languageId), name);
		}
	}

}
