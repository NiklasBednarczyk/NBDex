package de.niklasbednarczyk.nbdex.feature.pokemonform.impl.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBSmallTopAppBar
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content.NBNotYetImplementedContent
import de.niklasbednarczyk.nbdex.feature.pokemonform.api.navigation.PokemonFormNavKey
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.parameter.parametersOf

@Composable
fun PokemonFormScreen(
    navKey: PokemonFormNavKey,
) {
    val viewModel = koinViewModel<PokemonFormViewModel> { parametersOf(navKey) }
    val id by viewModel.id.collectAsStateWithLifecycle()

    PokemonFormScreen(
        id = id,
        onBack = viewModel::navigateBack,
    )
}

@Composable
private fun PokemonFormScreen(
    id: CorePokemonFormId?,
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    Scaffold(
        modifier = modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            NBSmallTopAppBar(
                scrollBehavior = scrollBehavior,
                titleText = id?.value?.toString().orEmpty(),
                onBack = onBack,
            )
        },
    ) { innerPadding ->
        NBNotYetImplementedContent(
            modifier = Modifier.padding(innerPadding),
        )
    }
}
